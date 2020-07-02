package com.me.work.character.search.api.model.v1;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Range
 */
public class Range   {
  @JsonProperty("shootingRange")
  private Double shootingRange;

  @JsonProperty("createDate")
  private OffsetDateTime createDate;

  public Range shootingRange(Double shootingRange) {
    this.shootingRange = shootingRange;
    return this;
  }

  /**
   * Get shootingRange
   * @return shootingRange
  */
  @ApiModelProperty(value = "")


  public Double getShootingRange() {
    return shootingRange;
  }

  public void setShootingRange(Double shootingRange) {
    this.shootingRange = shootingRange;
  }

  public Range createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Range range = (Range) o;
    return Objects.equals(this.shootingRange, range.shootingRange) &&
        Objects.equals(this.createDate, range.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shootingRange, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Range {\n");
    
    sb.append("    shootingRange: ").append(toIndentedString(shootingRange)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

