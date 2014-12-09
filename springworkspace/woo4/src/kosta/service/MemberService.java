package kosta.service;

import java.util.ArrayList;

import kosta.dao.MemberDaoImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import vo.MemberVO;

@Service("memberService")
public class MemberService implements UserDetailsService {
	@Autowired
	private MemberDaoImple dao;

	@Override
	public UserDetails loadUserByUsername(String mname)
			throws UsernameNotFoundException {
		System.out.println("Call!:"+mname);
		//�α��� ���̵�� �н����带 �����´�.
		MemberVO managerVO = dao.getUserPassword(mname);
		System.out.println("userPWD:"+managerVO.getMpwd());
		System.out.println("---------------------------------");
		//ROLE_USER �� �̸����� ������ �����Ѵ� .
		ArrayList<SimpleGrantedAuthority> roles =
		new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		//�α��� ������ ������ 
		UserDetails user = new User(managerVO.getMname(), managerVO.getMpwd(),
		roles);
		System.out.println("UserName : "+user.getUsername());
		System.out.println("UserPassword : "+user.getPassword());
		System.out.println("UserAuthorities() : "+user.getAuthorities());

		return user;
	}
}