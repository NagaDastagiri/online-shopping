package com.naga.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.naga.shoppingbackend.dao.CategoryDAO;
import com.naga.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("MOBILE");
		category.setDescription("mobile desc");
		category.setImageURL("mobiel url");

		Category category1 = new Category();
		category1.setId(2);
		category1.setName("TV");
		category1.setDescription("tv desc");
		category1.setImageURL("tv url");

		Category category2 = new Category();
		category2.setId(3);
		category2.setName("LAPTOPS");
		category2.setDescription("lap desc");
		category2.setImageURL("lap url");

		categories.add(category);
		categories.add(category1);
		categories.add(category2);

	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
