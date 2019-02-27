package com.naga.shoppingbackend.dao;

import java.util.List;

import com.naga.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
