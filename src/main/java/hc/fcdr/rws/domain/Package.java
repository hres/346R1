package hc.fcdr.rws.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "package")
public class Package implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -1022262431565740067L;
    private Long              id;
    private String            description;
    private String            upc;
    private String            brand;
    private String            manufacturer;
    private String            country;
    private Double            size;
    private String            sizeUnitOfMeasure;
    private String            storageType;
    private String            storageStatements;
    private String            healthClaims;
    private String            otherPackageStatements;
    private String            suggestedDirections;
    private String            ingredients;
    private Boolean           multiPartFlag;
    private String            nutritionFactTable;
    private Double            asPreparedPerServingAmount;
    private String            asPreparedUnitOfMeasure;
    private Double            asSoldPerServingAmount;
    private String            asSoldUnitOfMeasure;
    private Double            asPreparedPerServingAmountInGrams;
    private Double            asSoldPerServingAmountInGrams;
    private String            packageComment;
    private String            packageSource;
    private String            packageProductDescription;
    private Date              packageCollectionDate;
    private Integer           numberOfUnits;
    private Timestamp         creationDate;
    private Timestamp         lastEditDate;
    private String            editedBy;
    private Long              productId;

    public Package()
    {
        super();
        id = 0L;
        description = "";
        upc = "";
        brand = "";
        manufacturer = "";
        country = "";
        size = 0.0;
        sizeUnitOfMeasure = "";
        storageType = "";
        storageStatements = "";
        healthClaims = "";
        otherPackageStatements = "";
        suggestedDirections = "";
        ingredients = "";
        multiPartFlag = null;
        nutritionFactTable = "";
        asPreparedPerServingAmount = 0.0;
        asPreparedUnitOfMeasure = "";
        asSoldPerServingAmount = 0.0;
        asSoldUnitOfMeasure = "";
        asPreparedPerServingAmountInGrams = 0.0;
        asSoldPerServingAmountInGrams = 0.0;
        packageComment = "";
        packageSource = "";
        packageProductDescription = "";
        packageCollectionDate = null;
        numberOfUnits = 0;
        creationDate = null;
        lastEditDate = null;
        editedBy = "";
        productId = 0L;
    }

    public Package(final Long id, final String description, final String upc,
            final String brand, final String manufacturer, final String country,
            final Double size, final String sizeUnitOfMeasure,
            final String storageType, final String storageStatements,
            final String healthClaims, final String otherPackageStatements,
            final String suggestedDirections, final String ingredients,
            final Boolean multiPartFlag, final String nutritionFactTable,
            final Double asPreparedPerServingAmount,
            final String asPreparedUnitOfMeasure,
            final Double asSoldPerServingAmount,
            final String asSoldUnitOfMeasure,
            final Double asPreparedPerServingAmountInGrams,
            final Double asSoldPerServingAmountInGrams,
            final String packageComment, final String packageSource,
            final String packageProductDescription,
            final Date packageCollectionDate, final Integer numberOfUnits,
            final Timestamp creationDate, final Timestamp lastEditDate,
            final String editedBy, final Long productId)
    {
        super();
        this.id = id;
        this.description = description;
        this.upc = upc;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.country = country;
        this.size = size;
        this.sizeUnitOfMeasure = sizeUnitOfMeasure;
        this.storageType = storageType;
        this.storageStatements = storageStatements;
        this.healthClaims = healthClaims;
        this.otherPackageStatements = otherPackageStatements;
        this.suggestedDirections = suggestedDirections;
        this.ingredients = ingredients;
        this.multiPartFlag = multiPartFlag;
        this.nutritionFactTable = nutritionFactTable;
        this.asPreparedPerServingAmount = asPreparedPerServingAmount;
        this.asPreparedUnitOfMeasure = asPreparedUnitOfMeasure;
        this.asSoldPerServingAmount = asSoldPerServingAmount;
        this.asSoldUnitOfMeasure = asSoldUnitOfMeasure;
        this.asPreparedPerServingAmountInGrams =
                asPreparedPerServingAmountInGrams;
        this.asSoldPerServingAmountInGrams = asSoldPerServingAmountInGrams;
        this.packageComment = packageComment;
        this.packageSource = packageSource;
        this.packageProductDescription = packageProductDescription;
        this.packageCollectionDate = packageCollectionDate;
        this.numberOfUnits = numberOfUnits;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.editedBy = editedBy;
        this.productId = productId;
    }

    public Package(final Package _package)
    {
        super();
        id = _package.getId();
        description = _package.getDescription();
        upc = _package.getUpc();
        brand = _package.getBrand();
        manufacturer = _package.getManufacturer();
        country = _package.getCountry();
        size = _package.getSize();
        sizeUnitOfMeasure = _package.getSizeUnitOfMeasure();
        storageType = _package.getStorageType();
        storageStatements = _package.getStorageStatements();
        healthClaims = _package.getHealthClaims();
        otherPackageStatements = _package.getOtherPackageStatements();
        suggestedDirections = _package.getSuggestedDirections();
        ingredients = _package.getIngredients();
        multiPartFlag = _package.getMultiPartFlag();
        nutritionFactTable = _package.getNutritionFactTable();
        asPreparedPerServingAmount = _package.getAsPreparedPerServingAmount();
        asPreparedUnitOfMeasure = _package.getAsPreparedUnitOfMeasure();
        asSoldPerServingAmount = _package.getAsSoldPerServingAmount();
        asSoldUnitOfMeasure = _package.getAsSoldUnitOfMeasure();
        asPreparedPerServingAmountInGrams =
                _package.getAsPreparedPerServingAmountInGrams();
        asSoldPerServingAmountInGrams =
                _package.getAsSoldPerServingAmountInGrams();
        packageComment = _package.getPackageComment();
        packageSource = _package.getPackageSource();
        packageProductDescription = _package.getPackageProductDescription();
        packageCollectionDate = _package.getPackageCollectionDate();
        numberOfUnits = _package.getNumberOfUnits();
        creationDate = _package.getCreationDate();
        lastEditDate = _package.getLastEditDate();
        editedBy = _package.getEditedBy();
        productId = _package.getProductId();
    }

    public Long getId()
    {
        return id;
    }

    @XmlElement
    public void setId(final Long id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    @XmlElement
    public void setDescription(final String description)
    {
        this.description = description;
    }

    public String getUpc()
    {
        return upc;
    }

    @XmlElement
    public void setUpc(final String upc)
    {
        this.upc = upc;
    }

    public String getBrand()
    {
        return brand;
    }

    @XmlElement
    public void setBrand(final String brand)
    {
        this.brand = brand;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    @XmlElement
    public void setManufacturer(final String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getCountry()
    {
        return country;
    }

    @XmlElement
    public void setCountry(final String country)
    {
        this.country = country;
    }

    public Double getSize()
    {
        return size;
    }

    @XmlElement
    public void setSize(final Double size)
    {
        this.size = size;
    }

    public String getSizeUnitOfMeasure()
    {
        return sizeUnitOfMeasure;
    }

    @XmlElement
    public void setSizeUnitOfMeasure(final String sizeUnitOfMeasure)
    {
        this.sizeUnitOfMeasure = sizeUnitOfMeasure;
    }

    public String getStorageType()
    {
        return storageType;
    }

    @XmlElement
    public void setStorageType(final String storageType)
    {
        this.storageType = storageType;
    }

    public String getStorageStatements()
    {
        return storageStatements;
    }

    @XmlElement
    public void setStorageStatements(final String storageStatements)
    {
        this.storageStatements = storageStatements;
    }

    public String getHealthClaims()
    {
        return healthClaims;
    }

    @XmlElement
    public void setHealthClaims(final String healthClaims)
    {
        this.healthClaims = healthClaims;
    }

    public String getOtherPackageStatements()
    {
        return otherPackageStatements;
    }

    @XmlElement
    public void setOtherPackageStatements(final String otherPackageStatements)
    {
        this.otherPackageStatements = otherPackageStatements;
    }

    public String getSuggestedDirections()
    {
        return suggestedDirections;
    }

    @XmlElement
    public void setSuggestedDirections(final String suggestedDirections)
    {
        this.suggestedDirections = suggestedDirections;
    }

    public String getIngredients()
    {
        return ingredients;
    }

    @XmlElement
    public void setIngredients(final String ingredients)
    {
        this.ingredients = ingredients;
    }

    public Boolean getMultiPartFlag()
    {
        return multiPartFlag;
    }

    @XmlElement
    public void setMultiPartFlag(final Boolean multiPartFlag)
    {
        this.multiPartFlag = multiPartFlag;
    }

    public String getNutritionFactTable()
    {
        return nutritionFactTable;
    }

    @XmlElement
    public void setNutritionFactTable(final String nutritionFactTable)
    {
        this.nutritionFactTable = nutritionFactTable;
    }

    public Double getAsPreparedPerServingAmount()
    {
        return asPreparedPerServingAmount;
    }

    @XmlElement
    public void setAsPreparedPerServingAmount(
            final Double asPreparedPerServingAmount)
    {
        this.asPreparedPerServingAmount = asPreparedPerServingAmount;
    }

    public String getAsPreparedUnitOfMeasure()
    {
        return asPreparedUnitOfMeasure;
    }

    @XmlElement
    public void setAsPreparedUnitOfMeasure(final String asPreparedUnitOfMeasure)
    {
        this.asPreparedUnitOfMeasure = asPreparedUnitOfMeasure;
    }

    public Double getAsSoldPerServingAmount()
    {
        return asSoldPerServingAmount;
    }

    @XmlElement
    public void setAsSoldPerServingAmount(final Double asSoldPerServingAmount)
    {
        this.asSoldPerServingAmount = asSoldPerServingAmount;
    }

    public String getAsSoldUnitOfMeasure()
    {
        return asSoldUnitOfMeasure;
    }

    @XmlElement
    public void setAsSoldUnitOfMeasure(final String asSoldUnitOfMeasure)
    {
        this.asSoldUnitOfMeasure = asSoldUnitOfMeasure;
    }

    public Double getAsPreparedPerServingAmountInGrams()
    {
        return asPreparedPerServingAmountInGrams;
    }

    @XmlElement
    public void setAsPreparedPerServingAmountInGrams(
            final Double asPreparedPerServingAmountInGrams)
    {
        this.asPreparedPerServingAmountInGrams =
                asPreparedPerServingAmountInGrams;
    }

    public Double getAsSoldPerServingAmountInGrams()
    {
        return asSoldPerServingAmountInGrams;
    }

    @XmlElement
    public void setAsSoldPerServingAmountInGrams(
            final Double asSoldPerServingAmountInGrams)
    {
        this.asSoldPerServingAmountInGrams = asSoldPerServingAmountInGrams;
    }

    public String getPackageComment()
    {
        return packageComment;
    }

    @XmlElement
    public void setPackageComment(final String packageComment)
    {
        this.packageComment = packageComment;
    }

    public String getPackageSource()
    {
        return packageSource;
    }

    @XmlElement
    public void setPackageSource(final String packageSource)
    {
        this.packageSource = packageSource;
    }

    public String getPackageProductDescription()
    {
        return packageProductDescription;
    }

    @XmlElement
    public void setPackageProductDescription(
            final String packageProductDescription)
    {
        this.packageProductDescription = packageProductDescription;
    }

    public Date getPackageCollectionDate()
    {
        return packageCollectionDate;
    }

    @XmlElement
    public void setPackageCollectionDate(final Date packageCollectionDate)
    {
        this.packageCollectionDate = packageCollectionDate;
    }

    public Integer getNumberOfUnits()
    {
        return numberOfUnits;
    }

    @XmlElement
    public void setNumberOfUnits(final Integer numberOfUnits)
    {
        this.numberOfUnits = numberOfUnits;
    }

    public Timestamp getCreationDate()
    {
        return creationDate;
    }

    @XmlElement
    public void setCreationDate(final Timestamp creationDate)
    {
        this.creationDate = creationDate;
    }

    public Timestamp getLastEditDate()
    {
        return lastEditDate;
    }

    @XmlElement
    public void setLastEditDate(final Timestamp lastEditDate)
    {
        this.lastEditDate = lastEditDate;
    }

    public String getEditedBy()
    {
        return editedBy;
    }

    @XmlElement
    public void setEditedBy(final String editedBy)
    {
        this.editedBy = editedBy;
    }

    public Long getProductId()
    {
        return productId;
    }

    @XmlElement
    public void setProductId(final Long productId)
    {
        this.productId = productId;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result =
                (prime * result)
                        + ((asPreparedPerServingAmount == null)
                                ? 0 : asPreparedPerServingAmount.hashCode());
        result =
                (prime * result)
                        + ((asPreparedPerServingAmountInGrams == null)
                                ? 0
                                : asPreparedPerServingAmountInGrams.hashCode());
        result =
                (prime * result)
                        + ((asPreparedUnitOfMeasure == null)
                                ? 0 : asPreparedUnitOfMeasure.hashCode());
        result =
                (prime * result)
                        + ((asSoldPerServingAmount == null)
                                ? 0 : asSoldPerServingAmount.hashCode());
        result =
                (prime * result)
                        + ((asSoldPerServingAmountInGrams == null)
                                ? 0 : asSoldPerServingAmountInGrams.hashCode());
        result =
                (prime * result)
                        + ((asSoldUnitOfMeasure == null)
                                ? 0 : asSoldUnitOfMeasure.hashCode());
        result = (prime * result) + ((brand == null) ? 0 : brand.hashCode());
        result =
                (prime * result) + ((country == null) ? 0 : country.hashCode());
        result =
                (prime * result)
                        + ((creationDate == null)
                                ? 0 : creationDate.hashCode());
        result =
                (prime * result)
                        + ((description == null) ? 0 : description.hashCode());
        result =
                (prime * result)
                        + ((editedBy == null) ? 0 : editedBy.hashCode());
        result =
                (prime * result)
                        + ((healthClaims == null)
                                ? 0 : healthClaims.hashCode());
        result = (prime * result) + ((id == null) ? 0 : id.hashCode());
        result =
                (prime * result)
                        + ((ingredients == null) ? 0 : ingredients.hashCode());
        result =
                (prime * result)
                        + ((lastEditDate == null)
                                ? 0 : lastEditDate.hashCode());
        result =
                (prime * result)
                        + ((manufacturer == null)
                                ? 0 : manufacturer.hashCode());
        result =
                (prime * result)
                        + ((multiPartFlag == null)
                                ? 0 : multiPartFlag.hashCode());
        result =
                (prime * result)
                        + ((numberOfUnits == null)
                                ? 0 : numberOfUnits.hashCode());
        result =
                (prime * result)
                        + ((otherPackageStatements == null)
                                ? 0 : otherPackageStatements.hashCode());
        result =
                (prime * result)
                        + ((packageCollectionDate == null)
                                ? 0 : packageCollectionDate.hashCode());
        result =
                (prime * result)
                        + ((packageComment == null)
                                ? 0 : packageComment.hashCode());
        result =
                (prime * result)
                        + ((packageProductDescription == null)
                                ? 0 : packageProductDescription.hashCode());
        result =
                (prime * result)
                        + ((packageSource == null)
                                ? 0 : packageSource.hashCode());
        result =
                (prime * result)
                        + ((productId == null) ? 0 : productId.hashCode());
        result = (prime * result) + ((size == null) ? 0 : size.hashCode());
        result =
                (prime * result)
                        + ((sizeUnitOfMeasure == null)
                                ? 0 : sizeUnitOfMeasure.hashCode());
        result =
                (prime * result)
                        + ((storageStatements == null)
                                ? 0 : storageStatements.hashCode());
        result =
                (prime * result)
                        + ((storageType == null) ? 0 : storageType.hashCode());
        result =
                (prime * result)
                        + ((suggestedDirections == null)
                                ? 0 : suggestedDirections.hashCode());
        result = (prime * result) + ((upc == null) ? 0 : upc.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Package other = (Package) obj;
        if (asPreparedPerServingAmount == null)
        {
            if (other.asPreparedPerServingAmount != null)
                return false;
        }
        else if (!asPreparedPerServingAmount
                .equals(other.asPreparedPerServingAmount))
            return false;
        if (asPreparedPerServingAmountInGrams == null)
        {
            if (other.asPreparedPerServingAmountInGrams != null)
                return false;
        }
        else if (!asPreparedPerServingAmountInGrams
                .equals(other.asPreparedPerServingAmountInGrams))
            return false;
        if (asPreparedUnitOfMeasure == null)
        {
            if (other.asPreparedUnitOfMeasure != null)
                return false;
        }
        else if (!asPreparedUnitOfMeasure.equals(other.asPreparedUnitOfMeasure))
            return false;
        if (asSoldPerServingAmount == null)
        {
            if (other.asSoldPerServingAmount != null)
                return false;
        }
        else if (!asSoldPerServingAmount.equals(other.asSoldPerServingAmount))
            return false;
        if (asSoldPerServingAmountInGrams == null)
        {
            if (other.asSoldPerServingAmountInGrams != null)
                return false;
        }
        else if (!asSoldPerServingAmountInGrams
                .equals(other.asSoldPerServingAmountInGrams))
            return false;
        if (asSoldUnitOfMeasure == null)
        {
            if (other.asSoldUnitOfMeasure != null)
                return false;
        }
        else if (!asSoldUnitOfMeasure.equals(other.asSoldUnitOfMeasure))
            return false;
        if (brand == null)
        {
            if (other.brand != null)
                return false;
        }
        else if (!brand.equals(other.brand))
            return false;
        if (country == null)
        {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        if (creationDate == null)
        {
            if (other.creationDate != null)
                return false;
        }
        else if (!creationDate.equals(other.creationDate))
            return false;
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (editedBy == null)
        {
            if (other.editedBy != null)
                return false;
        }
        else if (!editedBy.equals(other.editedBy))
            return false;
        if (healthClaims == null)
        {
            if (other.healthClaims != null)
                return false;
        }
        else if (!healthClaims.equals(other.healthClaims))
            return false;
        if (id == null)
        {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (ingredients == null)
        {
            if (other.ingredients != null)
                return false;
        }
        else if (!ingredients.equals(other.ingredients))
            return false;
        if (lastEditDate == null)
        {
            if (other.lastEditDate != null)
                return false;
        }
        else if (!lastEditDate.equals(other.lastEditDate))
            return false;
        if (manufacturer == null)
        {
            if (other.manufacturer != null)
                return false;
        }
        else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (multiPartFlag == null)
        {
            if (other.multiPartFlag != null)
                return false;
        }
        else if (!multiPartFlag.equals(other.multiPartFlag))
            return false;
        if (numberOfUnits == null)
        {
            if (other.numberOfUnits != null)
                return false;
        }
        else if (!numberOfUnits.equals(other.numberOfUnits))
            return false;
        if (otherPackageStatements == null)
        {
            if (other.otherPackageStatements != null)
                return false;
        }
        else if (!otherPackageStatements.equals(other.otherPackageStatements))
            return false;
        if (packageCollectionDate == null)
        {
            if (other.packageCollectionDate != null)
                return false;
        }
        else if (!packageCollectionDate.equals(other.packageCollectionDate))
            return false;
        if (packageComment == null)
        {
            if (other.packageComment != null)
                return false;
        }
        else if (!packageComment.equals(other.packageComment))
            return false;
        if (packageProductDescription == null)
        {
            if (other.packageProductDescription != null)
                return false;
        }
        else if (!packageProductDescription
                .equals(other.packageProductDescription))
            return false;
        if (packageSource == null)
        {
            if (other.packageSource != null)
                return false;
        }
        else if (!packageSource.equals(other.packageSource))
            return false;
        if (productId == null)
        {
            if (other.productId != null)
                return false;
        }
        else if (!productId.equals(other.productId))
            return false;
        if (size == null)
        {
            if (other.size != null)
                return false;
        }
        else if (!size.equals(other.size))
            return false;
        if (sizeUnitOfMeasure == null)
        {
            if (other.sizeUnitOfMeasure != null)
                return false;
        }
        else if (!sizeUnitOfMeasure.equals(other.sizeUnitOfMeasure))
            return false;
        if (storageStatements == null)
        {
            if (other.storageStatements != null)
                return false;
        }
        else if (!storageStatements.equals(other.storageStatements))
            return false;
        if (storageType == null)
        {
            if (other.storageType != null)
                return false;
        }
        else if (!storageType.equals(other.storageType))
            return false;
        if (suggestedDirections == null)
        {
            if (other.suggestedDirections != null)
                return false;
        }
        else if (!suggestedDirections.equals(other.suggestedDirections))
            return false;
        if (upc == null)
        {
            if (other.upc != null)
                return false;
        }
        else if (!upc.equals(other.upc))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Package [id="
                + id + ", description=" + description + ", upc=" + upc
                + ", brand=" + brand + ", manufacturer=" + manufacturer
                + ", country=" + country + ", size=" + size
                + ", sizeUnitOfMeasure=" + sizeUnitOfMeasure + ", storageType="
                + storageType + ", storageStatements=" + storageStatements
                + ", healthClaims=" + healthClaims + ", otherPackageStatements="
                + otherPackageStatements + ", suggestedDirections="
                + suggestedDirections + ", ingredients=" + ingredients
                + ", multiPartFlag=" + multiPartFlag
                + ", asPreparedPerServingAmount=" + asPreparedPerServingAmount
                + ", asPreparedUnitOfMeasure=" + asPreparedUnitOfMeasure
                + ", asSoldPerServingAmount=" + asSoldPerServingAmount
                + ", asSoldUnitOfMeasure=" + asSoldUnitOfMeasure
                + ", asPreparedPerServingAmountInGrams="
                + asPreparedPerServingAmountInGrams
                + ", asSoldPerServingAmountInGrams="
                + asSoldPerServingAmountInGrams + ", packageComment="
                + packageComment + ", packageSource=" + packageSource
                + ", packageProductDescription=" + packageProductDescription
                + ", packageCollectionDate=" + packageCollectionDate
                + ", numberOfUnits=" + numberOfUnits + ", creationDate="
                + creationDate + ", lastEditDate=" + lastEditDate
                + ", editedBy=" + editedBy + ", productId=" + productId + "]";
    }

}
