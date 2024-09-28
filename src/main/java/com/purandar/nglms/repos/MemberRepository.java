package com.purandar.nglms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purandar.nglms.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
