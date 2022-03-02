package springJr.foodbasket.food.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@DiscriminatorColumn(name="type")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	protected String name;

	@Column(nullable = false)
	protected LocalDateTime storeAt;

	@Enumerated(EnumType.STRING)
	protected StoreLocation storeLocation;

	@Column(nullable = false)
	protected int quantity;
}



