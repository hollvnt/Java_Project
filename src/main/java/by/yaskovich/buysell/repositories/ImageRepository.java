package by.yaskovich.buysell.repositories;

import by.yaskovich.buysell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
