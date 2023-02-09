package com.devsuperior.dslearndemo.repositories;

import com.devsuperior.dslearndemo.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
