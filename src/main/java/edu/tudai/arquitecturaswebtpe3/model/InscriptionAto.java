package edu.tudai.arquitecturaswebtpe3.model;


import edu.tudai.arquitecturaswebtpe3.domain.entity.InscriptionStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "studentId", "careerId", "since", "status"})
@Builder
@EqualsAndHashCode
public class InscriptionAto {

    private Long id;

    private Long studentId;

    private Long careerId;

    private LocalDateTime since;

    private InscriptionStatus status;
}
