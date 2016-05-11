import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class CategoryTest {
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void Category_instantiatesCorrectly_True() {
    Category newCategory = new Category("Mexican");
    assertEquals(true, newCategory instanceof Category);
  }

  @Test
  public void all_emptyAtFirst_True() {
    assertEquals(Category.all().size(), 0);
  }

  @Test
  public void equals_returnsTrueIfCategoryAreTheSame_True() {
    Category firstCat = new Category("Chinese");
    Category secondCat = new Category("Chinese");
    assertTrue(firstCat.equals(secondCat));
  }

  @Test
  public void save_returnsTrueIfCategoriesAreTheSame_True() {
    Category newCategory = new Category("Mexican");
    newCategory.save();
    assertTrue(Category.all().get(0).equals(newCategory));
  }

}
