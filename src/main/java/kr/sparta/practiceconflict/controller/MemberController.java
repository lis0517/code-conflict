package kr.sparta.practiceconflict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.sparta.practiceconflict.entity.Member;

@RestController
@RequestMapping("/api/members")
public class MemberController {

	@GetMapping("/{id}")
	public Member getMember(@PathVariable Long id) {
		return null;
	}
}
