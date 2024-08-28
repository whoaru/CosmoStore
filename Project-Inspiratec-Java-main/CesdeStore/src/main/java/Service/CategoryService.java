package Service;

import domain.Category;
import interfaz.CategoryView;
import repository.CategoryRepository;

public class CategoryService implements Service.CategoryServiceInterface {

    Category category;
    public CategoryService(Category category){
        this.category = category;
    }


    @Override
    public void createCategory(Category category){

        CategoryRepository.createCategory(category);

    }


}
