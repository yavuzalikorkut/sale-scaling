package Abstract;

import Entity.Discount;

public interface DiscountService {
    void save(Discount discount);
    void update(Discount discount);
    void delete(Discount discount);
}
