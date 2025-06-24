package com.voting.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ElementCollection
    private List<OptionVote> options = new ArrayList<>();

//    @ElementCollection
//    private List<Long> votes = new ArrayList<>();

}
