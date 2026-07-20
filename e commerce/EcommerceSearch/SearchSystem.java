import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SearchSystem {
    private final List<Product> products;

    public SearchSystem(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public List<Product> search(String query) {
        if (query == null || query.isBlank()) {
            return new ArrayList<>(products);
        }

        String normalizedQuery = query.toLowerCase(Locale.ROOT);
        return products.stream()
                .filter(product -> product.getName().toLowerCase(Locale.ROOT).contains(normalizedQuery)
                        || product.getCategory().toLowerCase(Locale.ROOT).contains(normalizedQuery))
                .collect(Collectors.toList());
    }

    public List<Product> filterByCategory(String category) {
        if (category == null || category.isBlank()) {
            return new ArrayList<>(products);
        }

        String normalizedCategory = category.toLowerCase(Locale.ROOT);
        return products.stream()
                .filter(product -> product.getCategory().toLowerCase(Locale.ROOT).equals(normalizedCategory))
                .collect(Collectors.toList());
    }

    public List<Product> sortByPrice(boolean ascending) {
        return products.stream()
                .sorted((a, b) -> ascending ? Double.compare(a.getPrice(), b.getPrice()) : Double.compare(b.getPrice(), a.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Product> sortByRating(boolean ascending) {
        return products.stream()
                .sorted((a, b) -> ascending ? Double.compare(a.getRating(), b.getRating()) : Double.compare(b.getRating(), a.getRating()))
                .collect(Collectors.toList());
    }
}
