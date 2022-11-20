package edu.tudai.arquitecturaswebtpe3.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "name"})
@Builder
@EqualsAndHashCode
public class CareerAto {

    private Long id;

    private String name;
}
