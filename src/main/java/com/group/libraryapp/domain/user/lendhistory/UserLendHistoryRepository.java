package com.group.libraryapp.domain.user.lendhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLendHistoryRepository extends JpaRepository<UserLendHistory, Long> {

    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

}
