package com.pikecape.springboot.security.keycloak.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Duck {
  private String uid;
  private String name;
}
