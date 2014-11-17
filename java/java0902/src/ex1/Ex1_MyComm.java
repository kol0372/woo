/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

/**
 *
 * @author kosta
 * @since 2014.09.02
 */
public class Ex1_MyComm {
    /** @serialField
     * num이란 멤버 필드
     */
    int num;
    /**
     *  void : 반환값이 없음
     */
    public void print(){
        num = 10;
        System.out.println("Num :" + num);
    }
}
