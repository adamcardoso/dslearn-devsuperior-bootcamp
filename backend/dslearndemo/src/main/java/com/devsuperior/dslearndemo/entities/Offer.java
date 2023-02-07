package com.devsuperior.dslearndemo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter private Long id;

    @Getter
    @Setter private String edition;
    @Getter
    @Setter private Instant startMoment;
    @Getter
    @Setter private Instant endMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @Getter
    private Course course;

    @OneToMany(mappedBy = "offer")
    @Getter private List<Resource> resources = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offer offer = (Offer) o;

        return Objects.equals(id, offer.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
