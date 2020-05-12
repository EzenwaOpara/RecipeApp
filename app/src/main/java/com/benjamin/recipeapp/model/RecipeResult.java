package com.benjamin.recipeapp.model;

/*
 * Created by OPARA BENJAMIN
 * On 5/12/2020 - 8:59 PM
 */

import java.util.List;

public class RecipeResult {

    private List<RecipesBean> recipes;

    public List<RecipesBean> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<RecipesBean> recipes) {
        this.recipes = recipes;
    }

    public static class RecipesBean {
        /**
         * vegetarian : false
         * vegan : false
         * glutenFree : true
         * dairyFree : true
         * veryHealthy : false
         * cheap : false
         * veryPopular : false
         * sustainable : false
         * weightWatcherSmartPoints : 10
         * gaps : no
         * lowFodmap : true
         * aggregateLikes : 15
         * spoonacularScore : 77.0
         * healthScore : 28.0
         * creditsText : Foodista.com – The Cooking Encyclopedia Everyone Can Edit
         * license : CC BY 3.0
         * sourceName : Foodista
         * pricePerServing : 372.31
         * extendedIngredients : [{"id":15261,"aisle":"Seafood","image":"raw-tilapia.jpg","consistency":"solid","name":"tilapia","original":"4 tilapia fillets (or any other firm, white fish, such as cod","originalString":"4 tilapia fillets (or any other firm, white fish, such as cod","originalName":"tilapia fillets (or any other firm, white fish, such as cod","amount":4,"unit":"fillet","meta":["white","or any other firm,  fish, such as cod"],"metaInformation":["white","or any other firm,  fish, such as cod"],"measures":{"us":{"amount":4,"unitShort":"fillet","unitLong":"fillets"},"metric":{"amount":4,"unitShort":"fillet","unitLong":"fillets"}}},{"id":9150,"aisle":"Produce","image":"lemon.png","consistency":"solid","name":"lemon","original":"1 lemon, sliced in half","originalString":"1 lemon, sliced in half","originalName":"lemon, sliced in half","amount":1,"unit":"","meta":["sliced in half"],"metaInformation":["sliced in half"],"measures":{"us":{"amount":1,"unitShort":"","unitLong":""},"metric":{"amount":1,"unitShort":"","unitLong":""}}},{"id":12118,"aisle":"Canned and Jarred;Milk, Eggs, Other Dairy","image":"coconut-milk.png","consistency":"liquid","name":"coconut milk","original":"1/4 cup coconut milk","originalString":"1/4 cup coconut milk","originalName":"coconut milk","amount":0.25,"unit":"cup","meta":[],"metaInformation":[],"measures":{"us":{"amount":0.25,"unitShort":"cups","unitLong":"cups"},"metric":{"amount":59.147,"unitShort":"ml","unitLong":"milliliters"}}},{"id":93740,"aisle":"Gluten Free;Health Foods","image":"almond-meal-or-almond-flour.jpg","consistency":"solid","name":"almond flour","original":"1/2 cup almond meal, ground almonds, or almond flour","originalString":"1/2 cup almond meal, ground almonds, or almond flour","originalName":"almond meal, ground almonds, or almond flour","amount":0.5,"unit":"cup","meta":[],"metaInformation":[],"measures":{"us":{"amount":0.5,"unitShort":"cups","unitLong":"cups"},"metric":{"amount":118.294,"unitShort":"ml","unitLong":"milliliters"}}},{"id":10012108,"aisle":"Baking","image":"shredded-coconut.jpg","consistency":"solid","name":"unsweetened shredded coconut","original":"1/2 cup finely shredded unsweetened coconut","originalString":"1/2 cup finely shredded unsweetened coconut","originalName":"finely shredded unsweetened coconut","amount":0.5,"unit":"cup","meta":["shredded","unsweetened","finely"],"metaInformation":["shredded","unsweetened","finely"],"measures":{"us":{"amount":0.5,"unitShort":"cups","unitLong":"cups"},"metric":{"amount":118.294,"unitShort":"ml","unitLong":"milliliters"}}},{"id":2047,"aisle":"Spices and Seasonings","image":"salt.jpg","consistency":"solid","name":"salt","original":"1/4 teaspoon salt","originalString":"1/4 teaspoon salt","originalName":"salt","amount":0.25,"unit":"teaspoon","meta":[],"metaInformation":[],"measures":{"us":{"amount":0.25,"unitShort":"tsps","unitLong":"teaspoons"},"metric":{"amount":0.25,"unitShort":"tsps","unitLong":"teaspoons"}}},{"id":1002030,"aisle":"Spices and Seasonings","image":"pepper.jpg","consistency":"solid","name":"black pepper","original":"1/8 teaspoon black pepper","originalString":"1/8 teaspoon black pepper","originalName":"black pepper","amount":0.125,"unit":"teaspoon","meta":["black"],"metaInformation":["black"],"measures":{"us":{"amount":0.125,"unitShort":"tsps","unitLong":"teaspoons"},"metric":{"amount":0.125,"unitShort":"tsps","unitLong":"teaspoons"}}},{"id":2021,"aisle":"Spices and Seasonings","image":"ginger.png","consistency":"solid","name":"ground ginger","original":"1/2 teaspoon ground ginger","originalString":"1/2 teaspoon ground ginger","originalName":"ground ginger","amount":0.5,"unit":"teaspoon","meta":[],"metaInformation":[],"measures":{"us":{"amount":0.5,"unitShort":"tsps","unitLong":"teaspoons"},"metric":{"amount":0.5,"unitShort":"tsps","unitLong":"teaspoons"}}},{"id":2066,"aisle":"Spices and Seasonings","image":"mint.jpg","consistency":"solid","name":"dried mint","original":"1/2 teaspoon dried mint","originalString":"1/2 teaspoon dried mint","originalName":"dried mint","amount":0.5,"unit":"teaspoon","meta":["dried"],"metaInformation":["dried"],"measures":{"us":{"amount":0.5,"unitShort":"tsps","unitLong":"teaspoons"},"metric":{"amount":0.5,"unitShort":"tsps","unitLong":"teaspoons"}}},{"id":4582,"aisle":"Oil, Vinegar, Salad Dressing","image":"vegetable-oil.jpg","consistency":"liquid","name":"oil","original":"oil for frying (coconut oil is recommended)","originalString":"oil for frying (coconut oil is recommended)","originalName":"oil for frying (coconut oil is recommended)","amount":1,"unit":"serving","meta":["for frying","(coconut oil is recommended)"],"metaInformation":["for frying","(coconut oil is recommended)"],"measures":{"us":{"amount":1,"unitShort":"serving","unitLong":"serving"},"metric":{"amount":1,"unitShort":"serving","unitLong":"serving"}}}]
         * id : 639836
         * title : Coconut-Almond Crusted Tilapia
         * readyInMinutes : 45
         * servings : 4
         * sourceUrl : https://www.foodista.com/recipe/LDHBBCLQ/coconut-almond-crusted-tilapia
         * image : https://spoonacular.com/recipeImages/639836-556x370.jpg
         * imageType : jpg
         * summary : You can never have too many main course recipes, so give Coconut-Almond Crusted Tilapian a try. One portion of this dish contains around <b>39g of protein</b>, <b>21g of fat</b>, and a total of <b>359 calories</b>. This gluten free, dairy free, fodmap friendly, and whole 30 recipe serves 4 and costs <b>$3.72 per serving</b>. 13 people were glad they tried this recipe. It is brought to you by Foodista. If you have ground ginger, lemon, coconut, and a few other ingredients on hand, you can make it. From preparation to the plate, this recipe takes about <b>about 45 minutes</b>. All things considered, we decided this recipe <b>deserves a spoonacular score of 78%</b>. This score is solid. <a href="https://spoonacular.com/recipes/coconut-almond-crusted-tilapia-6728">Coconut Almond Crusted Tilapia</a>, <a href="https://spoonacular.com/recipes/almond-crusted-tilapia-512790">Almond Crusted Tilapia</a>, and <a href="https://spoonacular.com/recipes/almond-crusted-tilapia-601563">Almond Crusted Tilapia</a> are very similar to this recipe.
         * cuisines : []
         * dishTypes : ["lunch","main course","main dish","dinner"]
         * diets : ["gluten free","dairy free","fodmap friendly","pescatarian"]
         * occasions : []
         * winePairing : {"pairedWines":["pinot grigio","gruener veltliner","pinot noir","sparkling wine"],"pairingText":"Pinot Grigio, Gruener Veltliner, and Pinot Noir are great choices for Tilapia. Fish is as diverse as wine, so it's hard to pick wines that go with every fish. A crisp white wine, such as a pinot grigio or Grüner Veltliner, will suit any delicately flavored white fish. Meaty, strongly flavored fish such as salmon and tuna can even handle a light red wine, such as a pinot noir. The Tramin Unterebner Pinot Grigio with a 4.2 out of 5 star rating seems like a good match. It costs about 32 dollars per bottle.","productMatches":[{"id":485412,"title":"Tramin Unterebner Pinot Grigio","description":"The Unterebner is a substantial Pinot Grigio that shows a deep straw color and a nose dominated by spicy and floral aromas. On the palate, it balances mineral notes with considerable weight and richness. Flavors of pear and apple are followed by white flower and subtle notes of vanilla with a long and lasting finish.\nThis Pinot Grigio is ideal with a rich poultry dish like herb-roasted Cornish game hens.","price":"$31.99","imageUrl":"https://spoonacular.com/productImages/485412-312x231.jpg","averageRating":0.8400000000000001,"ratingCount":6,"score":0.7873684210526317,"link":"https://click.linksynergy.com/deeplink?id=*QCiIS6t4gA&mid=2025&murl=https%3A%2F%2Fwww.wine.com%2Fproduct%2Ftramin-unterebner-pinot-grigio-2017%2F520041"}]}
         * instructions : Pat and dry fish fillets. Sprinkle both sides with a pinch or two of salt and pepper. Squirt juice from 1/2 of the lemon and drizzle the coconut milk over top. Turn to ensure everything is coated well. Let them sit at room temperature for 15 minutes to marinate.
         Meanwhile prepare the breading by combining the almond meal, shredded coconut, salt, pepper, ginger and mint in a shallow bowl.
         Cover the bottom of a large skillet with oil and bring to medium heat. Lay fillets carefully in the skillet and cook, flipping fish halfway through cooking, until both sides are golden brown and fish flakes easily with a fork. Three to five minutes per side for thin fillets, longer if they're thicker.
         Transfer to a stack of paper towels to drain and cool slightly. Serve with Tropical Sweets & Reds Mash.
         * analyzedInstructions : [{"name":"","steps":[{"number":1,"step":"Pat and dry fish fillets. Sprinkle both sides with a pinch or two of salt and pepper. Squirt juice from 1/2 of the lemon and drizzle the coconut milk over top. Turn to ensure everything is coated well.","ingredients":[{"id":1102047,"name":"salt and pepper","image":"salt-and-pepper.jpg"},{"id":12118,"name":"coconut milk","image":"coconut-milk.png"},{"id":10115261,"name":"fish fillets","image":"fish-fillet.jpg"},{"id":9150,"name":"lemon","image":"lemon.png"}],"equipment":[]},{"number":2,"step":"Let them sit at room temperature for 15 minutes to marinate.","ingredients":[],"equipment":[],"length":{"number":15,"unit":"minutes"}},{"number":3,"step":"Meanwhile prepare the breading by combining the almond meal, shredded coconut, salt, pepper, ginger and mint in a shallow bowl.","ingredients":[{"id":93740,"name":"almond flour","image":"almond-meal-or-almond-flour.jpg"},{"id":1002030,"name":"pepper","image":"pepper.jpg"},{"id":2047,"name":"salt","image":"salt.jpg"}],"equipment":[{"id":404783,"name":"bowl","image":"bowl.jpg"}]},{"number":4,"step":"Cover the bottom of a large skillet with oil and bring to medium heat. Lay fillets carefully in the skillet and cook, flipping fish halfway through cooking, until both sides are golden brown and fish flakes easily with a fork. Three to five minutes per side for thin fillets, longer if they're thicker.","ingredients":[{"id":10115261,"name":"fish","image":"fish-fillet.jpg"},{"id":4582,"name":"cooking oil","image":"vegetable-oil.jpg"}],"equipment":[{"id":404645,"name":"frying pan","image":"pan.png"}],"length":{"number":3,"unit":"minutes"}},{"number":5,"step":"Transfer to a stack of paper towels to drain and cool slightly.","ingredients":[],"equipment":[{"id":405895,"name":"paper towels","image":"paper-towels.jpg"}]},{"number":6,"step":"Serve with Tropical Sweets & Reds Mash.","ingredients":[],"equipment":[]}]}]
         * originalId : null
         * spoonacularSourceUrl : https://spoonacular.com/coconut-almond-crusted-tilapia-639836
         */

        private boolean vegetarian;
        private boolean vegan;
        private boolean glutenFree;
        private boolean dairyFree;
        private boolean veryHealthy;
        private boolean cheap;
        private boolean veryPopular;
        private boolean sustainable;
        private int weightWatcherSmartPoints;
        private String gaps;
        private boolean lowFodmap;
        private int aggregateLikes;
        private double spoonacularScore;
        private double healthScore;
        private String creditsText;
        private String license;
        private String sourceName;
        private double pricePerServing;
        private int id;
        private String title;
        private int readyInMinutes;
        private int servings;
        private String sourceUrl;
        private String image;
        private String imageType;
        private String summary;
        private WinePairingBean winePairing;
        private String instructions;
        private Object originalId;
        private String spoonacularSourceUrl;
        private List<ExtendedIngredientsBean> extendedIngredients;
        private List<?> cuisines;
        private List<String> dishTypes;
        private List<String> diets;
        private List<?> occasions;
        private List<AnalyzedInstructionsBean> analyzedInstructions;

        public boolean isVegetarian() {
            return vegetarian;
        }

        public void setVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
        }

        public boolean isVegan() {
            return vegan;
        }

        public void setVegan(boolean vegan) {
            this.vegan = vegan;
        }

        public boolean isGlutenFree() {
            return glutenFree;
        }

        public void setGlutenFree(boolean glutenFree) {
            this.glutenFree = glutenFree;
        }

        public boolean isDairyFree() {
            return dairyFree;
        }

        public void setDairyFree(boolean dairyFree) {
            this.dairyFree = dairyFree;
        }

        public boolean isVeryHealthy() {
            return veryHealthy;
        }

        public void setVeryHealthy(boolean veryHealthy) {
            this.veryHealthy = veryHealthy;
        }

        public boolean isCheap() {
            return cheap;
        }

        public void setCheap(boolean cheap) {
            this.cheap = cheap;
        }

        public boolean isVeryPopular() {
            return veryPopular;
        }

        public void setVeryPopular(boolean veryPopular) {
            this.veryPopular = veryPopular;
        }

        public boolean isSustainable() {
            return sustainable;
        }

        public void setSustainable(boolean sustainable) {
            this.sustainable = sustainable;
        }

        public int getWeightWatcherSmartPoints() {
            return weightWatcherSmartPoints;
        }

        public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints) {
            this.weightWatcherSmartPoints = weightWatcherSmartPoints;
        }

        public String getGaps() {
            return gaps;
        }

        public void setGaps(String gaps) {
            this.gaps = gaps;
        }

        public boolean isLowFodmap() {
            return lowFodmap;
        }

        public void setLowFodmap(boolean lowFodmap) {
            this.lowFodmap = lowFodmap;
        }

        public int getAggregateLikes() {
            return aggregateLikes;
        }

        public void setAggregateLikes(int aggregateLikes) {
            this.aggregateLikes = aggregateLikes;
        }

        public double getSpoonacularScore() {
            return spoonacularScore;
        }

        public void setSpoonacularScore(double spoonacularScore) {
            this.spoonacularScore = spoonacularScore;
        }

        public double getHealthScore() {
            return healthScore;
        }

        public void setHealthScore(double healthScore) {
            this.healthScore = healthScore;
        }

        public String getCreditsText() {
            return creditsText;
        }

        public void setCreditsText(String creditsText) {
            this.creditsText = creditsText;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public double getPricePerServing() {
            return pricePerServing;
        }

        public void setPricePerServing(double pricePerServing) {
            this.pricePerServing = pricePerServing;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getReadyInMinutes() {
            return readyInMinutes;
        }

        public void setReadyInMinutes(int readyInMinutes) {
            this.readyInMinutes = readyInMinutes;
        }

        public int getServings() {
            return servings;
        }

        public void setServings(int servings) {
            this.servings = servings;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public WinePairingBean getWinePairing() {
            return winePairing;
        }

        public void setWinePairing(WinePairingBean winePairing) {
            this.winePairing = winePairing;
        }

        public String getInstructions() {
            return instructions;
        }

        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }

        public Object getOriginalId() {
            return originalId;
        }

        public void setOriginalId(Object originalId) {
            this.originalId = originalId;
        }

        public String getSpoonacularSourceUrl() {
            return spoonacularSourceUrl;
        }

        public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
            this.spoonacularSourceUrl = spoonacularSourceUrl;
        }

        public List<ExtendedIngredientsBean> getExtendedIngredients() {
            return extendedIngredients;
        }

        public void setExtendedIngredients(List<ExtendedIngredientsBean> extendedIngredients) {
            this.extendedIngredients = extendedIngredients;
        }

        public List<?> getCuisines() {
            return cuisines;
        }

        public void setCuisines(List<?> cuisines) {
            this.cuisines = cuisines;
        }

        public List<String> getDishTypes() {
            return dishTypes;
        }

        public void setDishTypes(List<String> dishTypes) {
            this.dishTypes = dishTypes;
        }

        public List<String> getDiets() {
            return diets;
        }

        public void setDiets(List<String> diets) {
            this.diets = diets;
        }

        public List<?> getOccasions() {
            return occasions;
        }

        public void setOccasions(List<?> occasions) {
            this.occasions = occasions;
        }

        public List<AnalyzedInstructionsBean> getAnalyzedInstructions() {
            return analyzedInstructions;
        }

        public void setAnalyzedInstructions(List<AnalyzedInstructionsBean> analyzedInstructions) {
            this.analyzedInstructions = analyzedInstructions;
        }

        public static class WinePairingBean {
            /**
             * pairedWines : ["pinot grigio","gruener veltliner","pinot noir","sparkling wine"]
             * pairingText : Pinot Grigio, Gruener Veltliner, and Pinot Noir are great choices for Tilapia. Fish is as diverse as wine, so it's hard to pick wines that go with every fish. A crisp white wine, such as a pinot grigio or Grüner Veltliner, will suit any delicately flavored white fish. Meaty, strongly flavored fish such as salmon and tuna can even handle a light red wine, such as a pinot noir. The Tramin Unterebner Pinot Grigio with a 4.2 out of 5 star rating seems like a good match. It costs about 32 dollars per bottle.
             * productMatches : [{"id":485412,"title":"Tramin Unterebner Pinot Grigio","description":"The Unterebner is a substantial Pinot Grigio that shows a deep straw color and a nose dominated by spicy and floral aromas. On the palate, it balances mineral notes with considerable weight and richness. Flavors of pear and apple are followed by white flower and subtle notes of vanilla with a long and lasting finish.\nThis Pinot Grigio is ideal with a rich poultry dish like herb-roasted Cornish game hens.","price":"$31.99","imageUrl":"https://spoonacular.com/productImages/485412-312x231.jpg","averageRating":0.8400000000000001,"ratingCount":6,"score":0.7873684210526317,"link":"https://click.linksynergy.com/deeplink?id=*QCiIS6t4gA&mid=2025&murl=https%3A%2F%2Fwww.wine.com%2Fproduct%2Ftramin-unterebner-pinot-grigio-2017%2F520041"}]
             */

            private String pairingText;
            private List<String> pairedWines;
            private List<ProductMatchesBean> productMatches;

            public String getPairingText() {
                return pairingText;
            }

            public void setPairingText(String pairingText) {
                this.pairingText = pairingText;
            }

            public List<String> getPairedWines() {
                return pairedWines;
            }

            public void setPairedWines(List<String> pairedWines) {
                this.pairedWines = pairedWines;
            }

            public List<ProductMatchesBean> getProductMatches() {
                return productMatches;
            }

            public void setProductMatches(List<ProductMatchesBean> productMatches) {
                this.productMatches = productMatches;
            }

            public static class ProductMatchesBean {
                /**
                 * id : 485412
                 * title : Tramin Unterebner Pinot Grigio
                 * description : The Unterebner is a substantial Pinot Grigio that shows a deep straw color and a nose dominated by spicy and floral aromas. On the palate, it balances mineral notes with considerable weight and richness. Flavors of pear and apple are followed by white flower and subtle notes of vanilla with a long and lasting finish.
                 This Pinot Grigio is ideal with a rich poultry dish like herb-roasted Cornish game hens.
                 * price : $31.99
                 * imageUrl : https://spoonacular.com/productImages/485412-312x231.jpg
                 * averageRating : 0.8400000000000001
                 * ratingCount : 6.0
                 * score : 0.7873684210526317
                 * link : https://click.linksynergy.com/deeplink?id=*QCiIS6t4gA&mid=2025&murl=https%3A%2F%2Fwww.wine.com%2Fproduct%2Ftramin-unterebner-pinot-grigio-2017%2F520041
                 */

                private int id;
                private String title;
                private String description;
                private String price;
                private String imageUrl;
                private double averageRating;
                private double ratingCount;
                private double score;
                private String link;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getImageUrl() {
                    return imageUrl;
                }

                public void setImageUrl(String imageUrl) {
                    this.imageUrl = imageUrl;
                }

                public double getAverageRating() {
                    return averageRating;
                }

                public void setAverageRating(double averageRating) {
                    this.averageRating = averageRating;
                }

                public double getRatingCount() {
                    return ratingCount;
                }

                public void setRatingCount(double ratingCount) {
                    this.ratingCount = ratingCount;
                }

                public double getScore() {
                    return score;
                }

                public void setScore(double score) {
                    this.score = score;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }
        }

        public static class ExtendedIngredientsBean {
            /**
             * id : 15261
             * aisle : Seafood
             * image : raw-tilapia.jpg
             * consistency : solid
             * name : tilapia
             * original : 4 tilapia fillets (or any other firm, white fish, such as cod
             * originalString : 4 tilapia fillets (or any other firm, white fish, such as cod
             * originalName : tilapia fillets (or any other firm, white fish, such as cod
             * amount : 4.0
             * unit : fillet
             * meta : ["white","or any other firm,  fish, such as cod"]
             * metaInformation : ["white","or any other firm,  fish, such as cod"]
             * measures : {"us":{"amount":4,"unitShort":"fillet","unitLong":"fillets"},"metric":{"amount":4,"unitShort":"fillet","unitLong":"fillets"}}
             */

            private int id;
            private String aisle;
            private String image;
            private String consistency;
            private String name;
            private String original;
            private String originalString;
            private String originalName;
            private double amount;
            private String unit;
            private MeasuresBean measures;
            private List<String> meta;
            private List<String> metaInformation;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAisle() {
                return aisle;
            }

            public void setAisle(String aisle) {
                this.aisle = aisle;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getConsistency() {
                return consistency;
            }

            public void setConsistency(String consistency) {
                this.consistency = consistency;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public String getOriginalString() {
                return originalString;
            }

            public void setOriginalString(String originalString) {
                this.originalString = originalString;
            }

            public String getOriginalName() {
                return originalName;
            }

            public void setOriginalName(String originalName) {
                this.originalName = originalName;
            }

            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public MeasuresBean getMeasures() {
                return measures;
            }

            public void setMeasures(MeasuresBean measures) {
                this.measures = measures;
            }

            public List<String> getMeta() {
                return meta;
            }

            public void setMeta(List<String> meta) {
                this.meta = meta;
            }

            public List<String> getMetaInformation() {
                return metaInformation;
            }

            public void setMetaInformation(List<String> metaInformation) {
                this.metaInformation = metaInformation;
            }

            public static class MeasuresBean {
                /**
                 * us : {"amount":4,"unitShort":"fillet","unitLong":"fillets"}
                 * metric : {"amount":4,"unitShort":"fillet","unitLong":"fillets"}
                 */

                private UsBean us;
                private MetricBean metric;

                public UsBean getUs() {
                    return us;
                }

                public void setUs(UsBean us) {
                    this.us = us;
                }

                public MetricBean getMetric() {
                    return metric;
                }

                public void setMetric(MetricBean metric) {
                    this.metric = metric;
                }

                public static class UsBean {
                    /**
                     * amount : 4.0
                     * unitShort : fillet
                     * unitLong : fillets
                     */

                    private double amount;
                    private String unitShort;
                    private String unitLong;

                    public double getAmount() {
                        return amount;
                    }

                    public void setAmount(double amount) {
                        this.amount = amount;
                    }

                    public String getUnitShort() {
                        return unitShort;
                    }

                    public void setUnitShort(String unitShort) {
                        this.unitShort = unitShort;
                    }

                    public String getUnitLong() {
                        return unitLong;
                    }

                    public void setUnitLong(String unitLong) {
                        this.unitLong = unitLong;
                    }
                }

                public static class MetricBean {
                    /**
                     * amount : 4.0
                     * unitShort : fillet
                     * unitLong : fillets
                     */

                    private double amount;
                    private String unitShort;
                    private String unitLong;

                    public double getAmount() {
                        return amount;
                    }

                    public void setAmount(double amount) {
                        this.amount = amount;
                    }

                    public String getUnitShort() {
                        return unitShort;
                    }

                    public void setUnitShort(String unitShort) {
                        this.unitShort = unitShort;
                    }

                    public String getUnitLong() {
                        return unitLong;
                    }

                    public void setUnitLong(String unitLong) {
                        this.unitLong = unitLong;
                    }
                }
            }
        }

        public static class AnalyzedInstructionsBean {
            /**
             * name :
             * steps : [{"number":1,"step":"Pat and dry fish fillets. Sprinkle both sides with a pinch or two of salt and pepper. Squirt juice from 1/2 of the lemon and drizzle the coconut milk over top. Turn to ensure everything is coated well.","ingredients":[{"id":1102047,"name":"salt and pepper","image":"salt-and-pepper.jpg"},{"id":12118,"name":"coconut milk","image":"coconut-milk.png"},{"id":10115261,"name":"fish fillets","image":"fish-fillet.jpg"},{"id":9150,"name":"lemon","image":"lemon.png"}],"equipment":[]},{"number":2,"step":"Let them sit at room temperature for 15 minutes to marinate.","ingredients":[],"equipment":[],"length":{"number":15,"unit":"minutes"}},{"number":3,"step":"Meanwhile prepare the breading by combining the almond meal, shredded coconut, salt, pepper, ginger and mint in a shallow bowl.","ingredients":[{"id":93740,"name":"almond flour","image":"almond-meal-or-almond-flour.jpg"},{"id":1002030,"name":"pepper","image":"pepper.jpg"},{"id":2047,"name":"salt","image":"salt.jpg"}],"equipment":[{"id":404783,"name":"bowl","image":"bowl.jpg"}]},{"number":4,"step":"Cover the bottom of a large skillet with oil and bring to medium heat. Lay fillets carefully in the skillet and cook, flipping fish halfway through cooking, until both sides are golden brown and fish flakes easily with a fork. Three to five minutes per side for thin fillets, longer if they're thicker.","ingredients":[{"id":10115261,"name":"fish","image":"fish-fillet.jpg"},{"id":4582,"name":"cooking oil","image":"vegetable-oil.jpg"}],"equipment":[{"id":404645,"name":"frying pan","image":"pan.png"}],"length":{"number":3,"unit":"minutes"}},{"number":5,"step":"Transfer to a stack of paper towels to drain and cool slightly.","ingredients":[],"equipment":[{"id":405895,"name":"paper towels","image":"paper-towels.jpg"}]},{"number":6,"step":"Serve with Tropical Sweets & Reds Mash.","ingredients":[],"equipment":[]}]
             */

            private String name;
            private List<StepsBean> steps;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public static class StepsBean {
                /**
                 * number : 1
                 * step : Pat and dry fish fillets. Sprinkle both sides with a pinch or two of salt and pepper. Squirt juice from 1/2 of the lemon and drizzle the coconut milk over top. Turn to ensure everything is coated well.
                 * ingredients : [{"id":1102047,"name":"salt and pepper","image":"salt-and-pepper.jpg"},{"id":12118,"name":"coconut milk","image":"coconut-milk.png"},{"id":10115261,"name":"fish fillets","image":"fish-fillet.jpg"},{"id":9150,"name":"lemon","image":"lemon.png"}]
                 * equipment : []
                 * length : {"number":15,"unit":"minutes"}
                 */

                private int number;
                private String step;
                private LengthBean length;
                private List<IngredientsBean> ingredients;
                private List<?> equipment;

                public int getNumber() {
                    return number;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public String getStep() {
                    return step;
                }

                public void setStep(String step) {
                    this.step = step;
                }

                public LengthBean getLength() {
                    return length;
                }

                public void setLength(LengthBean length) {
                    this.length = length;
                }

                public List<IngredientsBean> getIngredients() {
                    return ingredients;
                }

                public void setIngredients(List<IngredientsBean> ingredients) {
                    this.ingredients = ingredients;
                }

                public List<?> getEquipment() {
                    return equipment;
                }

                public void setEquipment(List<?> equipment) {
                    this.equipment = equipment;
                }

                public static class LengthBean {
                    /**
                     * number : 15
                     * unit : minutes
                     */

                    private int number;
                    private String unit;

                    public int getNumber() {
                        return number;
                    }

                    public void setNumber(int number) {
                        this.number = number;
                    }

                    public String getUnit() {
                        return unit;
                    }

                    public void setUnit(String unit) {
                        this.unit = unit;
                    }
                }

                public static class IngredientsBean {
                    /**
                     * id : 1102047
                     * name : salt and pepper
                     * image : salt-and-pepper.jpg
                     */

                    private int id;
                    private String name;
                    private String image;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }
                }
            }
        }
    }
}
