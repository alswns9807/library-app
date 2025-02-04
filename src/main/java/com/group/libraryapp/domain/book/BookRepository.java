package com.group.libraryapp.domain.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 2. domain 객체 만들 때 repository 인터페이스도 같이 정의       아래 타입은 id의 타입
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByName(String name);
}
