package com.me.work.character.search.api.model.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Spell
 */
public class Spell   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("controlType")
  private String controlType;

  @JsonProperty("basicDamage")
  private Integer basicDamage;

  @JsonProperty("upByLevel")
  private Integer upByLevel;

  @JsonProperty("iterationNumber")
  private Integer iterationNumber;

  @JsonProperty("effectArea")
  private String effectArea;

  @JsonProperty("keys")
  @Valid
  private List<Key> keys = new ArrayList<>();

  @JsonProperty("ranges")
  @Valid
  private List<Range> ranges = new ArrayList<>();

  public Spell id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Spell name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Spell controlType(String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Get controlType
   * @return controlType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getControlType() {
    return controlType;
  }

  public void setControlType(String controlType) {
    this.controlType = controlType;
  }

  public Spell basicDamage(Integer basicDamage) {
    this.basicDamage = basicDamage;
    return this;
  }

  /**
   * Get basicDamage
   * @return basicDamage
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getBasicDamage() {
    return basicDamage;
  }

  public void setBasicDamage(Integer basicDamage) {
    this.basicDamage = basicDamage;
  }

  public Spell upByLevel(Integer upByLevel) {
    this.upByLevel = upByLevel;
    return this;
  }

  /**
   * Get upByLevel
   * @return upByLevel
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getUpByLevel() {
    return upByLevel;
  }

  public void setUpByLevel(Integer upByLevel) {
    this.upByLevel = upByLevel;
  }

  public Spell iterationNumber(Integer iterationNumber) {
    this.iterationNumber = iterationNumber;
    return this;
  }

  /**
   * Get iterationNumber
   * @return iterationNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getIterationNumber() {
    return iterationNumber;
  }

  public void setIterationNumber(Integer iterationNumber) {
    this.iterationNumber = iterationNumber;
  }

  public Spell effectArea(String effectArea) {
    this.effectArea = effectArea;
    return this;
  }

  /**
   * Get effectArea
   * @return effectArea
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEffectArea() {
    return effectArea;
  }

  public void setEffectArea(String effectArea) {
    this.effectArea = effectArea;
  }

  public Spell keys(List<Key> keys) {
    this.keys = keys;
    return this;
  }

  public Spell addKeysItem(Key keysItem) {
    this.keys.add(keysItem);
    return this;
  }

  /**
   * Get keys
   * @return keys
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Key> getKeys() {
    return keys;
  }

  public void setKeys(List<Key> keys) {
    this.keys = keys;
  }

  public Spell ranges(List<Range> ranges) {
    this.ranges = ranges;
    return this;
  }

  public Spell addRangesItem(Range rangesItem) {
    this.ranges.add(rangesItem);
    return this;
  }

  /**
   * Get ranges
   * @return ranges
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Range> getRanges() {
    return ranges;
  }

  public void setRanges(List<Range> ranges) {
    this.ranges = ranges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spell spell = (Spell) o;
    return Objects.equals(this.id, spell.id) &&
        Objects.equals(this.name, spell.name) &&
        Objects.equals(this.controlType, spell.controlType) &&
        Objects.equals(this.basicDamage, spell.basicDamage) &&
        Objects.equals(this.upByLevel, spell.upByLevel) &&
        Objects.equals(this.iterationNumber, spell.iterationNumber) &&
        Objects.equals(this.effectArea, spell.effectArea) &&
        Objects.equals(this.keys, spell.keys) &&
        Objects.equals(this.ranges, spell.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, controlType, basicDamage, upByLevel, iterationNumber, effectArea, keys, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spell {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    basicDamage: ").append(toIndentedString(basicDamage)).append("\n");
    sb.append("    upByLevel: ").append(toIndentedString(upByLevel)).append("\n");
    sb.append("    iterationNumber: ").append(toIndentedString(iterationNumber)).append("\n");
    sb.append("    effectArea: ").append(toIndentedString(effectArea)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

