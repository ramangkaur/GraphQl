package com.techprimers.graphql.springbootgraphqlexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookDetailInput {

    private String isn;
    private String title;
    private String publisher;
}
