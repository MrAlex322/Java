from typing import List, Dict
from java_oop.HW_7.model import Bar, HotDrink
from java_oop.HW_7.repository import VendingMachineRepository

class VendingMachine:
    productTypes = ["HotDrink", "Bar"]
    
    @classmethod
    def getProductPriceList(cls) -> List[str]:
        return [f"{type(product).__name__} => {str(product)}" for product in VendingMachineRepository.productList]

    @classmethod
    def addProduct(cls, productType: str, productData: Dict[str, object]) -> None:
        if productType == "HotDrink":
            VendingMachineRepository.productList.append(HotDrink(productData))
        elif productType == "Bar":
            VendingMachineRepository.productList.append(Bar(productData))

    @classmethod
    def getProducts(cls, matchPattern: Dict[str, object]) -> List[str]:
        return [f"{type(product).__name__} => {str(product)}" for product in VendingMachineRepository.productList if product.isMatch(matchPattern)]
    
    @classmethod
    def getProductTypes(cls) -> List[str]:
        return cls.productTypes
