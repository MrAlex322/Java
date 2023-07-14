from model.Product import Product

class VendingMachineRepository():
    productList = []

class Bar(Product):
    def __init__(self, productData):
        super().__init__(productData)

class HotDrink(Product):
    def __init__(self, productData):
        super().__init__(productData)
