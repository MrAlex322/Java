import java_oop.HW_7.service.VendingMachineImpl;

class VendingMachineImpl:
    def __init__(self):
        self.products = {}

    def getProductTypes(self):
        return self.products.keys()

    def addProduct(self, productType, productData):
        if productType not in self.products:
            self.products[productType] = []
        self.products[productType].append(productData)

    def getProductPriceList(self):
        priceList = []
        for productType in self.products:
            for product in self.products[productType]:
                priceList.append(f"{productType}: ${product['price']}")
        return priceList

    def getProducts(self, matchPattern):
        matchingProducts = []
        for productType in self.products:
            for product in self.products[productType]:
                match = True
                for key, value in matchPattern.items():
                    if key not in product or product[key] != value:
                        match = False
                        break
                if match:
                    matchingProducts.append(product['name'])
        return matchingProducts

class VendingMachineController:
    def __init__(self):
        self.vendingMachineService = VendingMachineImpl()

    def addProduct(self, productType, productData):
        if productType in self.vendingMachineService.getProductTypes():
            self.vendingMachineService.addProduct(productType, productData)

    def getPpriceList(self):
        return self.vendingMachineService.getProductPriceList()

    def getProductByMatchPattern(self, matchPattern):
        return self.vendingMachineService.getProducts(matchPattern)
