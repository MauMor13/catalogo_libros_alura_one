package com.alura.oracleOne.DTOs;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookData(
        @JsonAlias("title") String title,
        @JsonAlias("language") Set<String> languages,
        @JsonAlias("authors") List<AuthorData> authors,
        @JsonAlias("download_count") int download_count
) {}
