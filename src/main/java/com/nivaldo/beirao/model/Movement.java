package com.nivaldo.beirao.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public  class  MovementId implements Serializable{
            private long idMovement;
            private long idUser;
        }
        @Id
        @EmbeddedId
        private MovementId MovementId;
        private LocalDateTime dateEntry;
        private LocalDateTime exitDate;
        private BigDecimal period;
        @ManyToOne
        private Occurrence occurrence;
        @ManyToOne
        private Calendar calendar;
}
