package com.devsuperior.dslearndemo.dto;

import com.devsuperior.dslearndemo.entities.pk.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliverRevisionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
}
