package com.example.grecangoss_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private List<Producto> productos;

    public ProductAdapter(List<Producto> productos) {
        this.productos = productos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Producto producto = productos.get(position);
        holder.bind(producto);
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewProductoCodigo, textViewProductoNumero, textViewProductoCategoria, textViewProductoDescripcion, getTextViewProductoPresentacion, textViewProductoCosto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewProductoCodigo = itemView.findViewById(R.id.textViewProductoCodigo);
            textViewProductoNumero = itemView.findViewById(R.id.textViewProductoNumero);
            textViewProductoCategoria = itemView.findViewById(R.id.textViewProductoCategoria);
            textViewProductoDescripcion = itemView.findViewById(R.id.textViewProductoDescripcion);
            getTextViewProductoPresentacion = itemView.findViewById(R.id.textViewProductoPresentacion);
            textViewProductoCosto = itemView.findViewById(R.id.textViewProductoCosto);

        }

        public void bind(Producto producto) {
            textViewProductoCodigo.setText(producto.getCodigo());
            textViewProductoNumero.setText(producto.getNumero());
            textViewProductoCategoria.setText(producto.getCategoria());
            textViewProductoDescripcion.setText(producto.getDescripcion());
            getTextViewProductoPresentacion.setText(producto.getPresentacion());
            textViewProductoCosto.setText(producto.getCostoVenta());
        }
    }
}
