package awslv2flower;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long orderId;
        private String flowerName;
        private Integer qty;
        private String status;
        private Long price;
        private String reviewMemo;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }
        public String getFlowerName() {
            return flowerName;
        }

        public void setFlowerName(String flowerName) {
            this.flowerName = flowerName;
        }
        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }
          public String getReviewMemo() {
            return reviewMemo;
        }

        public void setReviewMemo(String reviewMemo) {
            this.reviewMemo = reviewMemo;
        }
}
