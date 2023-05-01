from Product import Product

class HotDrink(Product):
    def __init__(self, productData):
        super().__init__(productData)
        self.temperature = productData["temperature"]
        self.volume = productData["volume"]

    def getTemperature(self):
        return self.temperature

    def getVolume(self):
        return self.volume

    def __str__(self):
        return super().__str__() + f" temperature: {self.temperature} volume: {self.volume:.2f}"

    def isMatch(self, matchPattern):
        matchBySuper = super().isMatch(matchPattern)
        matchByVolume = "volume" not in matchPattern or ("volume" in matchPattern and 
            isinstance(matchPattern["volume"], float) and matchPattern["volume"] == self.volume)
        matchByTemperature = "temperature" not in matchPattern or ("temperature" in matchPattern and 
            isinstance(matchPattern["temperature"], int) and matchPattern["temperature"] == self.temperature)
        return matchByTemperature and matchByVolume and matchBySuper
