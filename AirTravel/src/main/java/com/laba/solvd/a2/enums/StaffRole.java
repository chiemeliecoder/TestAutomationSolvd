package com.laba.solvd.a2.enums;

public enum StaffRole {
  ROLE1("Role 1", 1),
  ROLE2("Role 2", 2),
  ROLE3("Role 3", 3);

  private final String roleName;
  private final int skillLevel;

  StaffRole(String roleName, int skillLevel) {
    this.roleName = roleName;
    this.skillLevel = skillLevel;
  }

  public String getRoleName() {
    return roleName;
  }

  public int getSkillLevel() {
    return skillLevel;
  }
}
