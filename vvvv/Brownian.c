#include <stdio.h>
#include <math.h>
#include <Windows.h>
#define PI 3.141592654
#define dt 0.01
#define D 1.0  // D is inverse beta
#define num1 100000  //È½¼ö

long double a[10000][10000];
double gaussianRandom(void);

int main(void) 
{ 
	int i,j,x_axis,y_axis;
	float edge,lim,L_x,L_y,delta;
	double v_x,v_y;
	FILE *C=fopen("C:\\Users\\Theory\\Desktop\\Noise(Gaussian).txt", "wt");  // Counting number
	
	
	
	srand(GetTickCount());
	edge = 3.0 ;//edge is range the x-axis
	delta=0.1;
	lim = 2*edge/(delta);
	L_x=edge;
	L_y=edge;
	v_x=gaussianRandom(); // Define initial condition of velocity of x
	v_y=gaussianRandom(); // Define initial condition of velocity of y

	
	for(i=1;i<=num1;i++)
	{
		
		v_x=v_x-v_x*dt+sqrt(2*D*dt)*gaussianRandom(); 
		v_y=v_y-v_y*dt+sqrt(2*D*dt)*gaussianRandom();
		
		for(x_axis=0;x_axis<=lim;x_axis++)// Counting
		{	
			for(y_axis=0;y_axis<=lim;y_axis++)
			{
				if((v_x>L_x)&&(v_y>L_y)) 
				{
					a[x_axis][y_axis]+=1;
					goto finish;
				}
				else 
				{
					L_y-=delta;
				}
				
			}
			
			L_x-=delta;
			L_y=edge;
		}
		
		finish:
		L_x=edge;
		L_y=edge;
		printf("%10d¹ø³²À½\n" ,num1-i);	
	}	
	
	for(x_axis=0;x_axis<=lim;x_axis++)
	{
		for(y_axis=0 ;y_axis<=lim;y_axis++)
		{
		fprintf(C,"%5.2lf	%5.2lf	%d		%lf\n",edge-x_axis*delta , edge-y_axis*delta , (int)a[x_axis][y_axis], a[x_axis][y_axis]/(num1*delta*delta)); //Print the counting number
		//fprintf(C,"%5.2lf	%5.2lf	%d\n",edge-x_axis*delta , edge-y_axis*delta , (int)a[x_axis][y_axis]); //Print the counting number
		}
	}
	fclose(C);
	return 0;
}



double gaussianRandom(void)
{
	static double V1, V2, S;
	static int phase = 0;
	double X;
	
	if (phase == 0) 
	{
		do 
		{
			V1 = (double)rand() / RAND_MAX*2-1;
			V2 = (double)rand() / RAND_MAX*2-1;
      
			S = V1 * V1 + V2 * V2;
		} 
		while (S >= 1 || S == 0);
			X = V1 * sqrt(-2 * log(S) / S);
	} 
	else X = V2 * sqrt(-2 * log(S) / S);

	phase = 1 - phase;
	return X;
}