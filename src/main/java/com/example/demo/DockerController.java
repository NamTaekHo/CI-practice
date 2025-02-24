package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/test/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/test/member/{member-id}")
    public ResponseEntity testMember(@PathVariable("member-id") long memberId){
        MemberResponse response = new MemberResponse(memberId, "hong gildong", "CS001023004", "컨테이너 실습", "EEF9852", "STUDENT");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/test/dept/{dept-id}")
    public ResponseEntity testDept(@PathVariable("dept-id") long deptId){
        DeptResponse response = new DeptResponse(deptId, "CS001023004", "컨테이너 실습2", 3, "CS0010230000", "수강생대표팀");
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
