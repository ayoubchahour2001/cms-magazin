// Fetch products and populate table
async function loadProducts() {
    const response = await fetch('http://localhost:8080/api/products');
    const products = await response.json();

    const tbody = document.querySelector('#products-table tbody');
    tbody.innerHTML = '';

    products.forEach(p => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${p.id_product}</td>
            <td>${p.name_product}</td>
            <td>${p.type_product}</td>
            <td>${p.dimension || '-'}</td>
            <td>${p.price_product}</td>
        `;
        tbody.appendChild(row);
    });
}

// Load charts
async function loadCharts() {
    const stockData = await fetch('http://localhost:8080/api/stock-monthly').then(res => res.json());
    const purchaseData = await fetch('http://localhost:8080/api/purchase-monthly').then(res => res.json());
    const saleData = await fetch('http://localhost:8080/api/sale-monthly').then(res => res.json());

    const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

    new Chart(document.getElementById('stockChart'), {
        type: 'bar',
        data: { labels: months, datasets: [{ label: 'Stock', data: stockData, backgroundColor: 'blue' }] }
    });

    new Chart(document.getElementById('purchaseChart'), {
        type: 'line',
        data: { labels: months, datasets: [{ label: 'Purchase Price', data: purchaseData, borderColor: 'green', fill: false }] }
    });

    new Chart(document.getElementById('saleChart'), {
        type: 'line',
        data: { labels: months, datasets: [{ label: 'Sale Revenue', data: saleData, borderColor: 'orange', fill: false }] }
    });
}

// Optional: filter button
function filterData() {
    alert('Filtering by date not implemented yet');
}

// Initialize
loadProducts();
loadCharts();