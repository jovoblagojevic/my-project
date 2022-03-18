package com.jovo.myproject.research.domain;

import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface Recipe1Mapper {
    @Mapping(source = "note1Id", target = "note1.id")
    @Mapping(source = "note1Description", target = "note1.description")
    Recipe1 recipe1DtoToRecipe1(Recipe1Dto recipe1Dto);

    @InheritInverseConfiguration(name = "recipe1DtoToRecipe1")
    Recipe1Dto recipe1ToRecipe1Dto(Recipe1 recipe1);

    @InheritConfiguration(name = "recipe1DtoToRecipe1")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipe1FromRecipe1Dto(Recipe1Dto recipe1Dto, @MappingTarget Recipe1 recipe1);
}
