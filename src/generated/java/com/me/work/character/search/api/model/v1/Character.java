package com.me.work.character.search.api.model.v1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Character
 */
public class Character   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("role")
  private Role role;

  @JsonProperty("life")
  private Life life;

  @JsonProperty("spells")
  @Valid
  private List<Spell> spells = new ArrayList<>();

  public Character id(String id) {
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

  public Character name(String name) {
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

  public Character creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Character role(Role role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Character life(Life life) {
    this.life = life;
    return this;
  }

  /**
   * Get life
   * @return life
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Life getLife() {
    return life;
  }

  public void setLife(Life life) {
    this.life = life;
  }

  public Character spells(List<Spell> spells) {
    this.spells = spells;
    return this;
  }

  public Character addSpellsItem(Spell spellsItem) {
    this.spells.add(spellsItem);
    return this;
  }

  /**
   * Get spells
   * @return spells
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Spell> getSpells() {
    return spells;
  }

  public void setSpells(List<Spell> spells) {
    this.spells = spells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Character character = (Character) o;
    return Objects.equals(this.id, character.id) &&
        Objects.equals(this.name, character.name) &&
        Objects.equals(this.creationDate, character.creationDate) &&
        Objects.equals(this.role, character.role) &&
        Objects.equals(this.life, character.life) &&
        Objects.equals(this.spells, character.spells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creationDate, role, life, spells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Character {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    life: ").append(toIndentedString(life)).append("\n");
    sb.append("    spells: ").append(toIndentedString(spells)).append("\n");
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

