package edu.tudai.arquitecturaswebtpe3.model;

import edu.tudai.arquitecturaswebtpe3.domain.entity.Gender;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "givenNames", "lastName"})
@Builder
@EqualsAndHashCode
public class StudentAto {

    private Long id;

    private String givenNames;

    private String lastName;

    private LocalDate dateOfBirth;

    private Gender gender;

    private String dni;

    private String city;

    private Long studentId;
}


