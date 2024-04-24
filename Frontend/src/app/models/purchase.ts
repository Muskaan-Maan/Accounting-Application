export interface Purchase {
    id: number,
    customerName:string,
    invoiceNumber:string,
    dueDate:Date,
    productDescription:string,
    quantity:number,
    price:number,
    status:string,
    companyId: number
}
