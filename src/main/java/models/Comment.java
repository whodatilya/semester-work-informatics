package models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Comment {
    private int id;
    private int postId;
    private int userId;
    private String text;
}
