package com.marcomnrq.ecommerce.resource;

import com.mercadopago.resources.datastructures.preference.Item;
import java.util.List;
import lombok.Data;

@Data
public class MercadopagoResource {
  private String id;
  private String initPoint;
  private String sandboxInitPoint;
  private String externalReference;
  private List<Item> items;
}
