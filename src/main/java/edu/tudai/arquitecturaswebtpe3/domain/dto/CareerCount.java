package edu.tudai.arquitecturaswebtpe3.domain.dto;

import lombok.*;

/**
 * @author
 *  <ul>
 *    <li>Guillermina Lauge</li>
 *    <li>Pablo Mendoza</li>
 *    <li>Ricardo Gentil</li>
 *  </ul>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CareerCount {
    private Long careerId;
    private String careerName;
    private Long inscriptionsCount;
}
