package com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int commentId;
    @Column(name = "comment_title")
    private String commentTitle;
    @Column(name = "comment_content")
    private String commentContent;
    @Column(name = "comment_create_date")
    private Date commentCreateDate;
    @Column(name = "comment_score")
    private int commentScore;

    // Parent comment
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comment parent;

    // Sub comments
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Comment> children;




}
