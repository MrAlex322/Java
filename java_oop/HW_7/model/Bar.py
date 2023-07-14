from typing import Dict

from Product import Product


class Bar(Product):
    def __init__(self, product_data: Dict[str, object]):
        super().__init__(product_data)
        self.weight = float(product_data.get("weight", 0))

    def get_weight(self) -> float:
        return self.weight

    def __str__(self) -> str:
        return f"{super().__str__()} weight: {self.weight:.2f}"

    def is_match(self, match_pattern: Dict[str, object]) -> bool:
        match_by_super = super().is_match(match_pattern)
        match_by_weight = ("weight" not in match_pattern or 
                           ("weight" in match_pattern and 
                            isinstance(match_pattern["weight"], float) and 
                            match_pattern["weight"] == self.weight))
        return match_by_super and match_by_weight