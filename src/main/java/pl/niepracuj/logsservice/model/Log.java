package pl.niepracuj.logsservice.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="logs")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logged_on")
    private LocalDateTime loggedOn;

    private String message;
}
