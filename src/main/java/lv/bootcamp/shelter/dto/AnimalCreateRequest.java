package lv.bootcamp.shelter.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lv.bootcamp.shelter.model.AnimalType;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * JSON request body for creating a new animal via the REST API.
 * Status is not included; all new animals start as AVAILABLE.
 */
public record AnimalCreateRequest(

        @NotBlank(message = "Name is required")
        @Schema(description = "Name of the animal", example = "Buddy")
        String name,

        @NotNull(message = "Type is required")
        @Schema(description = "Animal type", example = "DOG")
        AnimalType type,

        @Schema(description = "Breed of the animal", example = "Labrador")
        String breed,

        @Min(value = 0, message = "Age cannot be negative")
        @Schema(description = "Age of the animal in years", example = "3")
        Integer age,

        @Schema(description = "Short description of the animal",
                example = "Friendly and playful")
        String description,

        @Schema(description = "Image filename or URL", example = "buddy.jpg")
        String imageUrl
) {}