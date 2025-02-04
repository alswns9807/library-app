package com.group.libraryapp.domain.book;

import javax.persistence.*;

// 1. table 생성 후 domain 객체 생성, 생성자 만들고 id는 자동 생성 되므로 protected 생성자 만들어 두기
//    table 과 객체를 Entity 로 매핑시키는 과정
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false) // , length = 255, name = "name"   길이와 이름은 기본값이므로 생략가능
    private String name;

    public Book(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 입력되었습니다.", name));
        }
        this.name = name;
    }

    protected Book() {

    }

    public String getName() {
        return name;
    }
}
