package net.spring.mvc.hibernate.product.dao;

import java.util.List;

import net.spring.mvc.hibernate.product.dto.ItemMaster;
 
public interface ItemMasterDAO {
 
    public List<ItemMaster> list();
    public void add(ItemMaster item);
    public ItemMaster  getItem(Long id);
 
}