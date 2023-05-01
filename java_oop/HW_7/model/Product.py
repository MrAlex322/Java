from abc import ABC, abstractmethod

class Product(ABC):
    def __init__(self, productData):
        self.name = productData['name']
        self.cost = productData['cost']

    def get_name(self):
        return self.name

    def get_cost(self):
        return self.cost

    def __str__(self):
        return f"Product name: {self.name} price: {self.cost}"

    def is_match(self, matchPattern):
        match_by_cost = "cost" not in matchPattern or \
                        ("cost" in matchPattern and isinstance(matchPattern["cost"], int) and matchPattern["cost"] == self.cost)
        match_by_name = "name" not in matchPattern or \
                        ("name" in matchPattern and isinstance(matchPattern["name"], str) and matchPattern["name"] == self.name)
        return match_by_cost and match_by_name
