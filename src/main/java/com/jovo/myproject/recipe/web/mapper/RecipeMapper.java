package com.jovo.myproject.recipe.web.mapper;

import com.jovo.myproject.recipe.domain.Recipe;
import com.jovo.myproject.recipe.web.dto.RecipeDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeMapper {

    @Mapping(source = "noteId", target = "note.id")
    @Mapping(source = "noteDescription", target = "note.description")
    Recipe recipeDtoToRecipe(RecipeDto recipeDto);

    @InheritInverseConfiguration(name = "recipeDtoToRecipe")
    RecipeDto recipeToRecipeDto(Recipe recipe);

    @InheritConfiguration(name = "recipeDtoToRecipe")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipeFromRecipeDto(RecipeDto recipeDto, @MappingTarget Recipe recipe);
}
