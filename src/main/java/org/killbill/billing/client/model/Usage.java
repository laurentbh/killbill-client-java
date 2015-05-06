package org.killbill.billing.client.model;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Usage {

    private LocalDate recordDate;
    private Long amount;
   
    @JsonCreator
    public Usage(@JsonProperty("recordDate") final LocalDate recordDate,
                 @JsonProperty("amount") final Long amount) {
        this.recordDate = recordDate;
        this.amount = amount;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public Long getAmount() {
        return amount;
    }
       
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usage{");
        sb.append("recordDate=").append(recordDate);
        sb.append(", amount=").append(amount);       
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode()
    {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((amount == null) ? 0 : amount.hashCode());
      result = prime * result + ((recordDate == null) ? 0 : recordDate.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj)
    {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Usage other = (Usage) obj;
      if (amount == null)
      {
        if (other.amount != null)
          return false;
      }
      else if (!amount.equals(other.amount))
        return false;
      if (recordDate == null)
      {
        if (other.recordDate != null)
          return false;
      }
      else if (!recordDate.equals(other.recordDate))
        return false;
      return true;
    }
    
    
}
