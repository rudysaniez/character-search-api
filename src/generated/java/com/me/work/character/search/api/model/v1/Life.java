package com.me.work.character.search.api.model.v1;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Life
 */
public class Life   {
  @JsonProperty("minimumLife")
  private Integer minimumLife;

  @JsonProperty("upByLevel")
  private Integer upByLevel;

  public Life minimumLife(Integer minimumLife) {
    this.minimumLife = minimumLife;
    return this;
  }

  /**
   * Get minimumLife
   * @return minimumLife
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getMinimumLife() {
    return minimumLife;
  }

  public void setMinimumLife(Integer minimumLife) {
    this.minimumLife = minimumLife;
  }

  public Life upByLevel(Integer upByLevel) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Life life = (Life) o;
    return Objects.equals(this.minimumLife, life.minimumLife) &&
        Objects.equals(this.upByLevel, life.upByLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLife, upByLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Life {\n");
    
    sb.append("    minimumLife: ").append(toIndentedString(minimumLife)).append("\n");
    sb.append("    upByLevel: ").append(toIndentedString(upByLevel)).append("\n");
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

