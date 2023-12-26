package com.example.auth.domain.product;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotBlank;

public record ProductRequestDTO(
        @NotBlank
        Integer price,
        @Nonnull
        String name
) {
}
