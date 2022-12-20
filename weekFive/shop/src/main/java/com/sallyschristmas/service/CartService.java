package com.sallyschristmas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sallyschristmas.entity.Cart;
import com.sallyschristmas.entity.Product;
import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.repo.CartRepo;

@Service
public class CartService {
    
    @Autowired
    CartRepo cartRepo;

    @Autowired
    ProductService productService;

    public Cart save(Cart cart) {
        return cartRepo.save(cart);
    }
    
    public Sapp addToCart(Sapp sapp, Product product) {

        // 1) Add the Product to the cart
        sapp.getCart().getProducts().add(product);
        // 2) save the cart to link your foreign key on the relational table
        save(sapp.getCart());
        // 3) return the Parent object
        return sapp;

    }

    public Sapp removeFromCart(Sapp sapp, Integer productId) {

        // 1) Get the product object with its id from the productService
        Product productToRemove = productService.getProductById(productId);
        // 2) remove the product object from the list of products in the Sapps cart
        sapp.getCart().getProducts().remove(productToRemove);
        // 3) save the cart to remove the foreign keys
        save(sapp.getCart());
        // 4) Return the parent object
        return sapp;

    }

    public Sapp clearCart(Sapp sapp) {

        sapp.getCart().getProducts().clear();

        save(sapp.getCart());

        return sapp;

    }

    public void deleteCart(Cart cart) {
        cartRepo.delete(cart);
    }

    public void deleteCartById(Integer cartId) {
        cartRepo.deleteById(cartId);
    }

}
